# jcrud-projeto-maven-jsf-cdi-jpa-hql-wildfly-postgres
 CRUD completo em Java EE com JSF, CDI, Hibernate 5.0.10/JPA 2.1,Prettyfaces, Primefaces, Maven, Postgres, Wildfly 10, Datasource, Internacionalização e o Eclipse como IDE...

 segue mesma ideia do projeto jcrud-projeto-maven-jsf-cdi-jpa-hql-wildfly

 O JPA foi configurado para usar datasource do wildfly

segue exemplo no arquivo standalone.xml e os arquivo para coloca a pasta postgres no diretorio do wildfly modules/system/layers/base/org

Tambem foi usado plugin do mavem para wildfly...

 Comandos para maven

  mvn wildfly:deploy            
  mvn wildfly:undeploy

