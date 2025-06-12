#!/bin/bash

# Step 1: Update package list
echo "Updating package list..."
sudo apt update -y

# Step 2: Install OpenJDK 19 if available, otherwise install OpenJDK 17
echo "Installing Java..."
sudo apt install -y openjdk-19-jre-headless || sudo apt install -y openjdk-17-jre-headless

# Step 3: Set JAVA_HOME environment variable for the current user
echo "Setting JAVA_HOME..."
echo "export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64" >> ~/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> ~/.bashrc

# Step 4: Reload bashrc to apply changes
source ~/.bashrc

# Step 5: Verify Java installation
echo "Verifying Java..."
java -version
echo "JAVA_HOME is set to: $JAVA_HOME"

