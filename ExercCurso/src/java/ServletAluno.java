import beans.Aluno;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import persistencia.AlunoBD;

/**
 *
 * @author José Flávio
 */
@WebServlet(urlPatterns = {"/ServletAluno"})
public class ServletAluno extends HttpServlet {
    
    private AlunoBD bd = new AlunoBD();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int opcao = Integer.parseInt(request.getParameter("opcao").toString());
        RequestDispatcher rd =null;
        if(opcao==1) //Inserir um aluno
        {
            Aluno aluno = new Aluno();
            
            aluno.setMatricula(request.getParameter("vmatricula"));
            aluno.setNome(request.getParameter("vnome"));
            aluno.setCurso(request.getParameter("vcurso"));
            aluno.setPeriodo(Integer.parseInt(request.getParameter("vperiodo").toString()));
            aluno.setAnoDeIngresso(Integer.parseInt(request.getParameter("vanoDeIngresso").toString()));
            aluno.setRenda(Double.parseDouble(request.getParameter("vrenda").toString()));
            
            bd.adicionarAluno(aluno);
            
            rd = request.getRequestDispatcher("ServletAluno?opcao=2");
            
        }
        
        if(opcao==2)
        {
            List<Aluno> todos = bd.buscarTodos();
            
            HttpSession session = request.getSession(true);
            session.setAttribute("lista", todos);
            
            rd = request.getRequestDispatcher("listarAlunos.jsp");
            
        }
        rd.forward(request, response);
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
