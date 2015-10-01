

int r,g,b;
float button1X=200, button1Y=200, button1W=80, button1H=40;
int counter=0;

void setup() {
  size( 640, 480 );
  reset();
}
void reset() {
  r=  100;
  g=  50;
  b=  250;
}

void draw() {
  background(r,g,b);
  showButton( button1X, button1Y, button1W, button1H );
  fill(100,50,180);
  text( "Beware!", button1X+button1W/4, button1Y+button1H*2/3 );
}
void showButton( float x, float y, float w, float h ) {
  fill( 255,50,0 );
  rect ( x,y, w,h );
}

void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 200,200, 80,40 ) ) {
    counter=  counter+1;
    if (counter %  2 > 0) {
      r=  255;
      g=  50;
      b=  100;
    } 
    else if ( counter % 4 > 0){
       r= 200;
       g= 199;
       b= 30;
  }   
      else if ( counter % 6 > 0){
       r= 240;
       g= 90;
       b= 23;
  }
      else if ( counter %  8 > 0){
       r= 99;
       g= 255;
       b= 180;
  }
      else if ( counter % 10 > 0){
       r= 0;
       g= 119;
       b= 245;
  }else {
      reset();
    }
  }
}


boolean hit( float x1, float y1,float x2, float y2, float w, float h ) {
  boolean result;


  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } 
    else {
    result=false;
  }

  return result;
}
