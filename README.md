# PA165
## Pneuservis [![Build Status](https://travis-ci.org/javorka/PA165.svg?branch=master)](https://travis-ci.org/javorka/PA165)
### Installation
```
mvn clean install
```
#### MVC
```
cd mvc
mvn tomcat7:run
```
Website will be available at `http://localhost:8080/pa165/`

Default users:
```
Admin
email: admin@pneuservis.fi.muni.cz
password: password

Customer
email: student@fi.muni.cz
password: password
```

#### REST
```
cd rest
mvn tomcat7:run
```
To see rest api documentation go to
`http://localhost:8080/pa165/rest/swagger-ui.html`

PA165 - Team 5
