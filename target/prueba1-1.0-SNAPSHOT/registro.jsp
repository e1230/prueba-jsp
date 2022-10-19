<%-- 
    Document   : index
    Created on : 11/10/2022, 08:25:49 PM
    Author     : is-da
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--Boostrap 5.0--%>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
              rel="stylesheet" 
              integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
              crossorigin="anonymous"/>

        <title>JSP Page</title>
    </head>
    <body class="bg-info d-flex justify-content-center align-items-center vh-100">

        <div class="bg-white p-5 rounded-5 text-secondary" style="width: 25rem">
            <div class="d-flex justify-content-center">
                <img src="imagenes/registro.png"
                     alt="login-icon"
                     style="height: 7rem"
                     /> 
            </div>
            <div class="text-center fs-1">Registrarse</div>
            <div class="input-group mt-4">

                <div class="input-group">
                    <label class="form-label">Ingrese su Nombre: </label>
                </div>

                <div class="input-group-text bg-info">
                    <img src ="imagenes/usuario.png"
                         alt="username-icon"
                         style="height: 1rem"
                         />
                </div>

                <input class="form-control bg-light" type="text" placeholder="User"/>
            </div>
            <div class="input-group mt-2">
                <div class="input-group">
                    <label class="form-label">Ingrese su Correo: </label>
                </div>
                <div class="input-group-text bg-info">
                    <img src ="imagenes/correo.png"
                         alt="password-icon"
                         style="height: 1rem"
                         />
                </div>
                <input class="form-control mt-2 bg-light" type="password" placeholder="Correo"/>
            </div>

            <div class="input-group mt-2">
                <div class="input-group">
                    <label class="form-label">Ingrese su Telefono: </label>
                </div>
                <div class="input-group-text bg-info">
                    <img src ="imagenes/telefono.png"
                         alt="password-icon"
                         style="height: 1rem"
                         />
                </div>
                <input class="form-control mt-2 bg-light" type="number" placeholder="Telefono"/>
            </div>
            
             <div class="input-group mt-2">
                <div class="input-group">
                    <label class="form-label">Ingrese su Contraseña: </label>
                </div>
                <div class="input-group-text bg-info">
                    <img src ="imagenes/telefono.png"
                         alt="password-icon"
                         style="height: 1rem"
                         />
                </div>
                <input class="form-control mt-2 bg-light" type="number" placeholder="Contraseña"/>
            </div>

            <div class="btn btn-info text-white w-100 mt-3 fw-semibold shadow-sm">Registrar</div>
            <div class="d-flex gap-1 justify-content-center mt-1">
                <div>Ya tienes cuenta?</div>
                <a class="text-decoration-none text-info fw-semibold" href="index.jsp">Volver al Inicio</a>
            </div>
            <div class="p-3">
                <div class="border-bottom text-center" style="height: 0.9rem">
                    <span class="bg-white px-3">OR</span>
                </div>
            </div>
            <div class="btn d-flex gap-2 justify-content-center border mt-2">
                <img src="imagenes/google.png"
                     alt="google-icon"
                     style="height: 1.6rem">
                <div class="fw-semibold text-secondary shadow-sm">
                    Continuar con Google
                </div>
            </div>
        </div>

    </div>
    s
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script><script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>
