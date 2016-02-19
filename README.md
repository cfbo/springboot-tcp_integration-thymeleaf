# springboot-tcp_integration-thymeleaf
An simple project using springboot, spring integration (TCP Inbound socket) and thymeleaf

Connecting to localhost:8080 the application shows the index.html, which makes use of thymeleaf and Spring MVC to provide a friendly presentation of Spring Activator endpoints.

The home page also has a link to the page "Inbound TCP Message" (on the top left).
This page shows the latest message received on TCP port 8987 (the port is configured on application.properties).

By opening a telnet connection on port 8987 it is possible to send a message via TCP to the application, which is the shown on the webpage (refresh the browser to see the latest message).


