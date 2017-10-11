# Spring Boot Deployment on WebLogic 
Despliegue de una aplicación basado Spring Boot sobre un Servidor de Aplicaciones WebLogic. 
### Descripción
Si bien es cierto el ecosistema Spring Boot ya trae un Servidor Tomcat embebido o configurar otro Servidor, pero a nivel de grandes compañias tener un
Tomcat no es lo ideal. Generalmente se tiene Servidores de Aplicaciones como IBM WAS, JBoos EAP o WebLogic, muchos de estos
servidores de Aplicación ya vienen optimizadas para DevOps y MicroServicios. En este caso vamos realizar un despliegue sobre
el Servidor de Aplicaciones WebLogic 12c de un proyecto Spring Boot y este ejemplo contiene un Servicio REST con dos Operaciones.

 * ###### Requerimientos:
   * Gradle
   * WebLogic 12c
   * Spring Boot 1.5.7.RELEASE
   * Hibernate Validator
   
 * ###### Detalles de Desarrollo:
   *  Uso de logback como Framework de Logging y se ha configurado para generar archivos de logs por día
   *  Uso Hibernate Validator
   *  Añadir el xml weblogic.xml
   *  El artefacto de despliegue es un WAR o puede generar un artefacto EAR.
   *  Servicio REST 
 * ###### No desarrollados:
   * No se realiza uso de Persitencia sobre una Base de Datos
   * No se tiene un CORE de persistencia para Datos.
   * No se tiene la customización de errores 
   
