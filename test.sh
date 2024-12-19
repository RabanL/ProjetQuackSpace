#!/bin/bash

# Répertoire où sont placés les fichiers compilés
BIN_DIR="bin"
# Répertoire contenant les bibliothèques JAR
LIB_DIR="lib"

# Exécution des tests avec ConsoleLauncher
echo "Exécution des tests..."
java -cp "$BIN_DIR:$LIB_DIR/*" org.junit.platform.console.ConsoleLauncher --scan-class-path
