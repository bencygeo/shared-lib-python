def call()
{
 //sh """find . -name '*.py' -print0|
 //xargs -0 -t -L 1 python2 -m py_compile"""
 sh "python pythonTest.py"
}
def logmessage(String msg)
{
 println(msg +"from logmessage")
}
