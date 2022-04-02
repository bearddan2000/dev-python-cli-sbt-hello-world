FROM hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

RUN yum install -y git python python-pip

WORKDIR /tmp

COPY bin/ .

RUN pip install -r requirements.txt

# ENTRYPOINT ["sbt"]

# CMD ["compile", "package", "run"]
