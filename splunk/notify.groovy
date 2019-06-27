@AfterStep
void call(context){
  println "AFTER STEP"
  println context
}

@BeforeStep
void before(context){
 println "BEFORE STEP" 
}

@Notify
void notify(context){
  println "NOTIFY" 
}
