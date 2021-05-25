## Utilisation
```bash
curl -d '{"username":"medkohen","password":"1234"}' -H "Content-Type: application/json" -X POST localhost:8080/authenticate

curl localhost:8080/hello -H "Authorization: Bearer <token>"
```

## Source of Code
https://medium.com/swlh/spring-boot-security-jwt-hello-world-example-b479e457664c
