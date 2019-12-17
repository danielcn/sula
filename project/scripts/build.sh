docker build \
--build-arg BASE_IMAGE_TAG="8u212-b04-jdk-stretch" \
--build-arg SBT_VERSION="1.3.3" \
--build-arg SCALA_VERSION="2.13.1" \
-t hseeberger/scala-sbt \
github.com/hseeberger/scala-sbt.git#:debian