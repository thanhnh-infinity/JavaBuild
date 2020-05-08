Java Compiler

1. Go to folder with Source, Libs and Config

3. Run command to run: 

Case 1:

javac -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. Test1.java

java -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. Test1

Case 2:

javac -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. src/nmsu/cs/re/Test2.java

java -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. src.nmsu.cs.re.Test2

5. Build JAR

javac -classpath ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. ./src/nmsu/cs/re/Test2.java -d ./out/

or

javac -classpath ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar ./src/nmsu/cs/re/Test2.java -d ./out/

or

javac -cp ./libs/google-collections-1.0-rc2.jar:./libs/log4j-1.2.17.jar:. ./src/nmsu/cs/re/Test2.java -d ./out/

then

jar cvfm ExecutableOne.jar ./src/nmsu/cs/resources/META-INF/MANIFEST.MF -C ./out/ .


Can be able reference for full Ant Build

https://mkyong.com/ant/ant-how-to-create-a-jar-file-with-external-libraries/

