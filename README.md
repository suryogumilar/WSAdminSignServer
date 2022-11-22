# generate from WSDL to POJO java bind using Apache CXF plugins

How to run:   
`mvn generate-sources`

both keystore and trustore option must exist 

keystore contains private key of apps and its public key must be put inside signserver truststore file, while truststore must contain public key of signserver



### environment to set

```
-Djavax.net.ssl.trustStore=/trustore_location/trust_store.jks 
-Djavax.net.ssl.trustStorePassword=password 
-Djavax.net.ssl.keyStorePassword=password 
-Djavax.net.ssl.keyStore=/keystore_location/keystore_for_access_signserver.jks
```

add this option for debug

` -Djavax.net.debug=all `


