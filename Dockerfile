# Utiliser l'image Docker OpenJDK 17
FROM openjdk:17

# Définir le répertoire de travail
WORKDIR /CRMLAST

# Copier les fichiers de l'application dans le conteneur
COPY . /CRMLAST/

# Exécuter la commande Maven pour construire l'application
#RUN mvn clean install -DskipTests

# Exposer le port 8080 (à remplacer par le port de votre application)
EXPOSE 808000

# Lancer l'application
CMD ["java", "-jar", "target/CRMLAST-1.0-SNAPSHOT.jar"]
