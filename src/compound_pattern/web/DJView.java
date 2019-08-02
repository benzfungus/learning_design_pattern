package compound_pattern.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import compound_pattern.BeatModel;
@WebServlet("/djview/servlet/DJView")
public class DJView extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Override
    public void init() throws ServletException {
        BeatModel beatModel = new BeatModel();
        beatModel.initialize();
        getServletContext().setAttribute("beatModel", beatModel);
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        BeatModel beatModel = (BeatModel)getServletContext().getAttribute("beatModel");
        String bpm = req.getParameter("bpm");
        if (bpm == null) {
            bpm = beatModel.getBPM() + "";
        }
        String set = req.getParameter("set");
        if(set != null) {
            int bpmNumber = 90;
            bpmNumber = Integer.parseInt(bpm);
            beatModel.setBPM(bpmNumber);
        }
        String decrease = req.getParameter("decrease");
        if (decrease != null) {
            beatModel.setBPM(beatModel.getBPM() - 1);
        }
        String increase = req.getParameter("increase");
        if (increase != null) {
            beatModel.setBPM(beatModel.getBPM() + 1);
        }
        String on = req.getParameter("on");
        if(on != null) {
            beatModel.on();
        }
        String off = req.getParameter("off");
        if(off != null) {
            beatModel.off();
        }
        
        req.setAttribute("beatModel", beatModel);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/DJView.jsp");
        dispatcher.forward(req, res);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
