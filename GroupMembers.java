class Group{

String groupname;
String membername;
int age;
String specialization;

void display(){

System.out.println(groupname + " " + membername + " " + age + " " + specialization);

}
}
class GroupMembers{
public static void main(String args[]){
Group member1=new Group();
member1.groupname="colors";
member1.membername="Prathima";
member1.age=22;
member1.specialization="BE CSE";
member1.display();

Group member2=new Group();
member2.groupname="colors";
member2.membername="Praveen";
member2.age=22;
member2.specialization="BE MECH";
member2.display();

Group member3=new Group();
member3.groupname="colors";
member3.membername="Rathish";
member3.age=22;
member3.specialization="BE ECE";
member3.display();

Group member4=new Group();
member4.groupname="colors";
member4.membername="Sanjay";
member4.age=22;
member4.specialization="BE MECH";
member4.display();

Group member5=new Group();
member5.groupname="colors";
member5.membername="Hadhiya";
member5.age=22;
member5.specialization="BE ECE";
member5.display();
}
}
