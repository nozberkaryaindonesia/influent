# .devcontainer/Dockerfile

FROM ubuntu:20.04

# Prevent interactive prompts during package installation
ENV DEBIAN_FRONTEND=noninteractive

# Update and install essential packages
RUN apt-get update && apt-get install -y \
    build-essential \
    cmake \
    git \
    libboost-dev \
    libssl-dev \
    libpq-dev \
    guile-3.0-dev \
    cxxtest \
    cython \
    ocaml \
    ocaml-findlib \
    postgresql \
    postgresql-client \
    libpq-dev \
    ghc \
    cabal-install \
    maven \
    openjdk-11-jdk \
    && rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# Install Maven (if not available via apt)
# Uncomment if you need a specific Maven version
# RUN wget https://archive.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz \
#     && tar -xzf apache-maven-3.8.6-bin.tar.gz -C /opt \
#     && ln -s /opt/apache-maven-3.8.6 /opt/maven \
#     && ln -s /opt/maven/bin/mvn /usr/bin/mvn \
#     && rm apache-maven-3.8.6-bin.tar.gz

# Install Haskell packages (if needed)
RUN cabal update

# Set up PostgreSQL (optional, if you need it for development)
# You might need to initialize and start PostgreSQL manually
