FROM mysql
ENV MYSQL_DATABASE demo
ENV MYSQL_ROOT_PASSWORD demo

# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./mysql/sql-scripts/ /docker-entrypoint-initdb.d/