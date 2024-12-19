#!/bin/bash

# Répertoire contenant les fichiers source
SRC_DIR="src"
# Répertoire où seront placés les fichiers compilés
BIN_DIR="bin"
# Répertoire contenant les bibliothèques JAR
LIB_DIR="lib"

# Création du répertoire de sortie s'il n'existe pas
mkdir -p $BIN_DIR

# Compilation des fichiers Java
echo "Compilation des fichiers Java..."
javac -d $BIN_DIR -cp "$LIB_DIR/*" $SRC_DIR/*.java

# Vérification du succès de la compilation
if [ $? -eq 0 ]; then
    echo "Compilation réussie. Les fichiers sont dans $BIN_DIR"
else
    echo "Erreur de compilation."
    exit 1
fi
