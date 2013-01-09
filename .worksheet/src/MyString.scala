object MyString {

  class MyString(val jString: String) {
    private var extraData = ""
    override def toString = jString + extraData
  }
  object MyString {
    def apply(base: String, extras: String) = {
      val s = new MyString(base)
      s.extraData = extras
      s
    }
    def apply(base: String) = new MyString(base)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(376); 

  println(MyString("hello", " world"));$skip(29); 
  println(MyString("hello"))}

}