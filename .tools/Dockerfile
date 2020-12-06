FROM debian:buster

RUN apt-get update \
  && apt-get install -y --no-install-recommends \
    asciidoctor \
    bash-completion \
    curl \
    ca-certificates \
    cowsay \
    git \
    linkchecker \
    make \
    npm \
    sl \
    watch

RUN npm install netlify-cli -g

RUN curl -sSLO https://github.com/AdoptOpenJDK/openjdk15-binaries/releases/download/jdk-15.0.1%2B9/OpenJDK15U-jdk_x64_linux_hotspot_15.0.1_9.tar.gz \
  && tar xzf OpenJDK15U-jdk_x64_linux_hotspot_15.0.1_9.tar.gz -C /opt \
  && rm -f OpenJDK15U-jdk_x64_linux_hotspot_15.0.1_9.tar.gz
RUN curl -sSLO https://apache.belnet.be/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz \
  && tar xzf apache-maven-3.6.3-bin.tar.gz -C /opt \
  && rm -f apache-maven-3.6.3-bin.tar.gz
ENV JAVA_HOME=/opt/jdk-15.0.1+9 \
  PATH=/opt/jdk-15.0.1+9/bin:/opt/apache-maven-3.6.3/bin:/usr/games/:$PATH

# Handle cases where the PATH environment variable is overridden with this ugly hack
RUN find /opt/*/bin -type f -executable -exec ln -s {} /usr/local/bin/ \;
