package ru.more02.ex21;

public  class TextDocument implements IDocument {
   // new  CreateTextDocument();
    CreateTextDocument createTextDocument = new CreateTextDocument() {
       @Override
       public int hashCode() {
           return super.hashCode();
       }
   };
}
