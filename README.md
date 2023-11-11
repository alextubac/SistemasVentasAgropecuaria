# Manual de Usuario - Agropecuaria El Buen Precio
# SistemasVentasAgropecuaria 
# 1. Inicio de Sesión
Accede al sistema proporcionando tu nombre de usuario y contraseña en la página de inicio de sesión. Esta página se encuentra en el archivo index.jsp.

Ingresa tu nombre de usuario y contraseña.
Haz clic en "Ingresar".
# 2. Página Principal
Después de iniciar sesión con éxito, serás redirigido a la página principal (principal.jsp). Aquí encontrarás varias opciones de menú:

Productos: Visualiza, agrega, modifica o elimina productos en el inventario. Haz clic en "PRODUCTO" en la barra de navegación para acceder.

Empleados: Gestiona la información de los empleados, incluyendo su nombre, cargo y otras detalles. Haz clic en "EMPLEADO" en la barra de navegación para acceder.

Clientes: Administra la información de los clientes, como nombre, dirección, etc. Haz clic en "CLIENTES" en la barra de navegación para acceder.

Nueva Venta: Registra nuevas ventas, selecciona productos y clientes, y guarda la información de la venta. Haz clic en "NUEVA VENTA" en la barra de navegación para acceder.

Usuario: Visualiza información sobre tu cuenta y cierra sesión. Tu nombre de usuario se muestra en la esquina superior derecha.

# 3. Funcionalidades de CRUD
3.1 Productos
Visualizar Productos
Haz clic en "PRODUCTO" en la barra de navegación.
Se mostrará una lista de productos existentes.
Agregar Producto
En la página de "PRODUCTO", haz clic en "Agregar Producto".
Completa los detalles del nuevo producto.
Haz clic en "Guardar".
Modificar Producto
En la página de "PRODUCTO", selecciona el producto que deseas modificar.
Actualiza la información según sea necesario.
Haz clic en "Guardar".
Eliminar Producto
En la página de "PRODUCTO", selecciona el producto que deseas eliminar.
Confirma la eliminación.
3.2 Empleados y Clientes
Visualizar Empleados/Clientes
Haz clic en "EMPLEADO" o "CLIENTES" en la barra de navegación.
Se mostrará una lista de empleados o clientes existentes.
Agregar Empleado/Cliente
En la página correspondiente, haz clic en "Agregar Empleado" o "Agregar Cliente".
Completa los detalles del nuevo empleado o cliente.
Haz clic en "Guardar".
Modificar Empleado/Cliente
En la página correspondiente, selecciona el empleado o cliente que deseas modificar.
Actualiza la información según sea necesario.
Haz clic en "Guardar".
Eliminar Empleado/Cliente
En la página correspondiente, selecciona el empleado o cliente que deseas eliminar.
Confirma la eliminación.
3.3 Nueva Venta
Haz clic en "NUEVA VENTA" en la barra de navegación.
Selecciona los productos y clientes involucrados en la venta.
Completa los detalles de la venta.
Haz clic en "Guardar".
# 4. Cierre de Sesión
En la esquina superior derecha de la página principal, encontrarás tu nombre de usuario. Si deseas cerrar sesión:

Haz clic en tu nombre de usuario.
Selecciona "Salir".

# Manual Técnico - Agropecuaria El Buen Precio
1. Introducción
1.1 Objetivo
El presente manual tiene como objetivo proporcionar una guía técnica para el desarrollo, instalación y mantenimiento de la aplicación Agropecuaria El Buen Precio.

1.2 Tecnologías Utilizadas
El sistema está desarrollado utilizando las siguientes tecnologías:

Frontend: JavaServer Pages (JSP)
Backend: Java
Base de Datos: MySQL a través de PhpMyAdmin
Framework CSS: Bootstrap
2. Estructura del Proyecto
2.1 Estructura de Carpetas
El proyecto sigue una estructura básica de carpetas:

Web Content: Contiene archivos JSP, recursos estáticos, y el archivo web.xml.
WEB-INF: Contiene archivos de configuración y recursos internos.
CSS, JS, IMG: Carpetas para almacenar estilos, scripts y recursos gráficos.
3. Inicio de Sesión
3.1 Validación de Usuario
El sistema inicia con la página index.jsp, que contiene un formulario de inicio de sesión (Validar servlet) con campos para el nombre de usuario y contraseña. La validación se realiza en el backend.

4. Página Principal
4.1 Menú de Navegación
La página principal (principal.jsp) presenta un menú de navegación con las siguientes opciones:

PRODUCTO: Controla la gestión de productos.
EMPLEADO: Permite gestionar información de empleados.
CLIENTES: Facilita la administración de clientes.
NUEVA VENTA: Permite realizar nuevas ventas.
4.2 Datos del Usuario
En la esquina superior derecha se muestra el nombre de usuario del empleado conectado.

5. Funcionalidades de CRUD
5.1 Gestión de Productos
Listar Productos: Despliega una lista de productos existentes.
Agregar Producto: Permite la inserción de nuevos productos.
Modificar Producto: Permite la actualización de detalles de productos.
Eliminar Producto: Elimina productos seleccionados.
5.2 Gestión de Empleados y Clientes
Listar Empleados/Clientes: Muestra una lista de empleados o clientes existentes.
Agregar Empleado/Cliente: Permite agregar nuevos empleados o clientes.
Modificar Empleado/Cliente: Facilita la actualización de detalles de empleados o clientes.
Eliminar Empleado/Cliente: Elimina empleados o clientes seleccionados.
5.3 Nueva Venta
Registro de Venta: Permite seleccionar productos y clientes para registrar una nueva venta.
6. Cierre de Sesión
La opción "Salir" en el menú desplegable del usuario en la esquina superior derecha permite cerrar la sesión activa.

7. Tecnologías y Dependencias
7.1 Frameworks y Bibliotecas
Bootstrap (v4.6.2): Utilizado para el diseño y estilo del frontend.
jQuery (v3.3.1): Utilizado para simplificar la manipulación del DOM.
7.2 Backend
Java Servlets: Para gestionar las solicitudes y respuestas del servidor.
MySQL Connector: Para la conexión y manipulación de la base de datos MySQL.
7.3 Base de Datos
MySQL (a través de PhpMyAdmin): Almacenamiento de datos relacionados con productos, empleados, clientes y ventas.
8. Instalación y Configuración
8.1 Configuración de la Base de Datos
Importar el script de la base de datos proporcionado (script.sql).
Configurar los detalles de conexión en el archivo web.xml.
8.2 Despliegue de la Aplicación
Empaquetar la aplicación en un archivo WAR.
Desplegar el archivo WAR en un contenedor de servlets compatible (por ejemplo, Apache Tomcat).
9. Mantenimiento
9.1 Actualización de la Aplicación
Para actualizar la aplicación:

Realizar cambios en el código fuente.
Empaquetar y desplegar la nueva versión en el entorno de producción.
10. Soporte Técnico
Para obtener asistencia técnica, comuníquese con nuestro equipo de soporte a través de [correo electrónico, teléfono, etc.].

Este manual técnico proporciona una visión general de la arquitectura, tecnologías utilizadas y pasos básicos para la instalación y mantenimiento del sistema. Personaliza los detalles según las necesidades específicas de tu aplicación y entorno.
