docker-build:
	docker-compose build

docker-seed:
	docker-compose run --rm seed

docker-c1:
	docker-compose run --rm c1

docker-c2:
	docker-compose run --rm c2

docker-down:
	docker-compose down
docket-stop:
  docker-compose stop

docker-clean-container:
	docker rm $(docker ps -aq)

docker-clean-images:
	docker rmi $(docker ps -aq)
