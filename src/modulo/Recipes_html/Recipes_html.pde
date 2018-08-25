int x = 250;
int x1 = 750;
void setup(){
size(1000,1000);
}

void draw(){
noFill();
background(255,255,255);
for(int i = 300; i > 10;i-=10){
ellipse(x,250,i,i);
ellipse(x1,250,i,i);}

}