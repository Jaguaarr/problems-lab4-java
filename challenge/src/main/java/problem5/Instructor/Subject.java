class Subject {
    private int id;
    private String code;
    private String title;

    public Subject(int id, String code, String title){
      this.id = id;
      this;code = code;
      this.title = title;
    }
    public String normalizedCode(){
      return code.trim().toUpperCase();
      
    }
    public String properTitle(){
     String[] words = this.title.split(" ");
     StringBuilder sb = new StringBuilder();

     for (String word : words){
       if (word.length() > 0){
         sb.append(Character.toUpperCase(word.charAt(0)));
         sb.append(word.substring(1).toLowerCase());
         sb.append(" ");
       }
     }
    return sb;
    }

    

}
