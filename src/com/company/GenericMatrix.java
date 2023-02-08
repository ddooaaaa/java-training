package com.company;

public  abstract class GenericMatrix<E extends Number>{
    protected  abstract E add(E o1,E o2);
    protected  abstract E multy(E o1,E o2);
    protected  abstract E rere();
            public E[][] addMatrix(E[][] matrix1,E[][] matrix2) {
                    if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
                             throw new RuntimeException("no ");
                    E[][] res=  (E[][]) new Number[matrix1.length ][matrix1[0].length];
                          for (int i =0; i< res.length;i++){
                             for (int j=0;j< res.length;j++)
                                  res[i][j]= add (matrix1[i][j],matrix2[i][j]);
                            }
                 return res;


           }

           public E[][]  maltymatrix( E[][] matrix1,E[][]matrix2)
           {
               if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
                   throw new RuntimeException("no ");
               E[][] res=  (E[][]) new Number[matrix1.length ][matrix1[0].length];
               for (int i =0; i< res.length;i++){
                   for (int j=0;j< res.length;j++)
                       res[i][j]= multy (matrix1[i][j],matrix2[i][j]);
               }
               return res;


           }
}
