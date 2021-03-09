
test: DataWranglerTests.class BackEndDeveloperTests.class FrontEndDeveloperTests.class
	java -jar junit5.jar -cp . --scan-classpath

DataWranglerTests.class: DataWranglerTests.java BackendDummy.class BackendInterface.class MemberInterface.class MemberReaderInterface.class
	javac -cp .:junit5.jar DataWranglerTests.java

BackEndDeveloperTests.class: BackEndDeveloperTests.java
	javac -cp .:junit5.jar BackEndDeveloperTests.java

FrontEndDeveloperTests.class: FrontEndDeveloperTests.java
	javac -cp .:junit5.jar FrontEndDeveloperTests.java

BackendDummy.class: BackendDummy.java
    javac BackendDummy.java

BackendInterface.class: BackendInterface.java
    javac BackendInterface.java

MemberInterface.class: MemberInterface.java
    javac MemberInterface.java

MemberReaderInterface.class: MemberReaderInterface.java
    javac MemberReaderInterface.java

clean: 
	$(RM) *.class
	$(RM) *~



