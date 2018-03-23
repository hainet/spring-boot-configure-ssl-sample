# Configure SSl
## Generate a self-signed SSL certificate
```
keytool -genkeypair -alias myalias -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
keytool -list -v -storetype pkcs12 -keystore keystore.p12
```

## Spring boot reference
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-configure-ssl
