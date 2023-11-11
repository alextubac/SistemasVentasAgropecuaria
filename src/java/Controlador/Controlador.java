
package Controlador;


import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Venta;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class Controlador extends HttpServlet {
    Empleado em =new Empleado();
    EmpleadoDAO edao=new EmpleadoDAO();
    Cliente cl=new Cliente();
    ClienteDAO cdao=new ClienteDAO();
    Producto prd=new Producto();
    ProductoDAO pdao=new ProductoDAO();
    int ide;
    int cde;
    int pr;
    
    Venta v=new Venta();
    List<Venta>lista=new ArrayList<>();
    int item;
    int cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    double totalPagar;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")){
            switch (accion){
                    case "Listar":
                        List lista=edao.listar();
                        request.setAttribute("empleados", lista);
                        
                        break;
                    case "Agregar":
                        String dni=request.getParameter("txtDni");
                        String nom=request.getParameter("txtNombres");
                        String tel=request.getParameter("txtTel");
                        String est=request.getParameter("txtEstado");
                        String user=request.getParameter("txtUser");
                        em.setDni(dni);
                        em.setNom(nom);
                        em.setTel(tel);
                        em.setEstado(est);
                        em.setUser(user);
                        edao.agregar(em);
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                        case "Editar":
                            ide=Integer.parseInt(request.getParameter("id"));
                            Empleado e=edao.listarId(ide);
                            request.setAttribute("empleado", e);
                            request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                        case "Actualizar":
                        String dni1 = request.getParameter("txtDni");
                        String nom1 = request.getParameter("txtNombres");
                        String tel1 = request.getParameter("txtTel");
                        String est1 = request.getParameter("txtEstado");
                        String user1 = request.getParameter("txtUser");
                        em.setDni(dni1);
                        em.setNom(nom1);
                        em.setTel(tel1);
                        em.setEstado(est1);
                        em.setUser(user1);
                        em.setId(ide);                        
                        edao.actualizar(em);
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                        case "Delete":
                            ide=Integer.parseInt(request.getParameter("id"));
                            edao.delete(ide);
                            request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                        default:
                            throw new AssertionError();
                            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        if (menu.equals("Cliente")){
        switch (accion){
            case "Listar":
                List lista=cdao.listar();
                request.setAttribute("clientes", lista);
                break;
                case "Agregar":
                        String dni=request.getParameter("txtDni");
                        String nom=request.getParameter("txtNom");
                        String dire=request.getParameter("txtDire");
                        String est=request.getParameter("txtEstado");
                        cl.setDni(dni);
                        cl.setNom(nom);
                        cl.setDire(dire);
                        cl.setEstado(est);
                        cdao.agregar(cl);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                        case "Editar":
                            cde=Integer.parseInt(request.getParameter("id"));
                            Cliente e=cdao.listarId(cde);
                            request.setAttribute("cliente", e);
                            request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                        case "Actualizar":
                        String dni1 = request.getParameter("txtDni");
                        String nom1 = request.getParameter("txtNom");
                        String dire1 = request.getParameter("txtDire");
                        String est1 = request.getParameter("txtEstado");
                        cl.setDni(dni1);
                        cl.setNom(nom1);
                        cl.setDire(dire1);
                        cl.setEstado(est1);
                        cl.setId(cde);                        
                        cdao.actualizar(cl);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                        case "Delete":
                            cde=Integer.parseInt(request.getParameter("id"));
                            cdao.delete(cde);
                            request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;
                        default:
                            throw new AssertionError();
                            }

        
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }
        if (menu.equals("Producto")){
        switch (accion){
            case "Listar":
                List lista=pdao.listar();
                request.setAttribute("productos", lista);
                break;
                case "Agregar":
                        String nomp=request.getParameter("txtNom");
                        String prep=request.getParameter("txtPre");
                        int stockp= Integer.parseInt(request.getParameter("txtStock"));
                        String estp=request.getParameter("txtEstado");
                        prd.setNom(nomp);
                        prd.setPre(prep);
                        prd.setStock(stockp);
                        prd.setEstado(estp);
                        pdao.agregar(prd);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;

                        case "Editar":
                            pr=Integer.parseInt(request.getParameter("id"));
                            Producto productoeditar=pdao.listarId(pr);
                            request.setAttribute("producto", productoeditar);
                            request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                        case "Actualizar":
                        String nomp1 = request.getParameter("txtNom");
                        String prep1 = request.getParameter("txtPre");
                        int stockp1 = Integer.parseInt(request.getParameter("txtStock"));
                        String estp1 = request.getParameter("txtEstado");
                        prd.setNom(nomp1);
                        prd.setPre(prep1);
                        prd.setStock(stockp1);
                        prd.setEstado(estp1);
                        prd.setId(pr);                        
                        pdao.actualizar(prd);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                        case "Delete":
                            pr=Integer.parseInt(request.getParameter("id"));
                            pdao.delete(pr);
                            request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                        default:
                            throw new AssertionError();
                            }
        
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        if (menu.equals("NuevaVenta")){
            switch (accion) {
                case "BuscarCliente":
                    String dni=request.getParameter("codigocliente");
                    cl.setDni(dni);
                    cl=cdao.buscar(dni);
                    request.setAttribute("c",cl);
                    break;
                case "BuscarProducto":
                    int id=Integer.parseInt(request.getParameter("codigoproducto"));
                    prd=pdao.listarId(id);
                    request.setAttribute("producto",prd);
                    request.setAttribute("lista",lista);
                    break;
                case "Agregar":
                    totalPagar =0.0;
                    item = item+1;
                    cod = prd.getId();
                    descripcion = request.getParameter("nomproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    subtotal = precio * cant;
                    v=new Venta();
                    v.setItem(item);
                    v.setId(cod);
                    v.setDescripcionP(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for(int i = 0; i < lista.size(); i++){
                        totalPagar=totalPagar +lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("lista",lista);
                    break;
                default:
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
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
