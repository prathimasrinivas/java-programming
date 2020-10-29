class ContinueWhileDemo{

public static void main(String args[]){

int i=0;
while(i<9){
if(i%2==0){
i++;
continue;
}
System.out.println(i);
i++;
}
}
}