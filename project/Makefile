docker-build:
	docker-compose build

docker-pull:
	docker pull danielcn/sula

docker-migrate:
	docker-compose run --rm web ...

docker-createsuperuser:
	docker-compose run --rm web ...

docker-loaddata:
	docker-compose run --rm web python manage.py loaddata dump_data/*.json

docker-dev:
	docker-compose -f docker-compose.yml -f docker-compose.dev.yml up dev

docker-heroku:
	docker-compose up web

docker-down:
	docker-compose down