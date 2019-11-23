# 02-microservices-individual-tasks-jonasschuerz

CLD und ERD meines Projektes finden Sie unter: https://github.com/1920-5bhif-nvs/01-assignment-quarkus-jpa-jonasschuerz

## Deployment
- Starten des ersten Projektes von: https://github.com/1920-5bhif-nvs/01-assignment-quarkus-jpa-jonasschuerz
- Starten des microservices Projektes (quarkus-microservice-firedepartment)

## Extensions hinzufügen
 https://code.quarkus.io/ <br>
```mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-health"```  <br>
```mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-metrics" ``` <br>
```mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-fault-tolerance" ```  <br>
```mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-resteasy-jsonb"```  <br>
```mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-rest-client"``` 

## application.properties
``` 
# Configuration file
# key = value
quarkus.http.port=8080
%dev.quarkus.http.port=8181
at.htl.firedepartment.vehicle.boundary.VehicleService/mp-rest/url=http://localhost:8080/api
at.htl.firedepartment.vehicle.boundary.VehicleService/mp-rest/scope=javax.inject.Singleton
```

## Prometheus
Prometheus ist ein Open Source monitoring and alerting toolkit für Container und Microservices. Das Toolkit ist in hohem Maße anpassbar und bietet umfassende Messdaten, ohne die Systemleistung zu beeinträchtigen. 

## Istio
Istio stellt ein offenes, plattformunabhängiges Service Mesh zur Verfügung, mit dem sich die Microservices verteilt arbeitender Cloud-native-Anwendungen komfortabel verwalten lassen. Zu den Kernfunktionen gehören das Traffic Management sowie Sicherheits-, Verbindungs- und Monitoring-Funktionen.


### Quellen
- cloudcomputing-insider.de
- opensource.com
- prometheus.io