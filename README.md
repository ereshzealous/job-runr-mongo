Build application
./gradlew bootJar

docker build from the root directory

docker build -t app.jar .

Start application
This will load the dashboard and one background job server

docker compose up

A lot of load incoming - scale background job servers up:

docker compose up --scale springboot-backend=3