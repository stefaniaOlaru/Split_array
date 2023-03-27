Pentru rezolvarea problemei am folosit formula dedusa mai jos:
1. trebuie sa vedem daca putem imparti sirul initial in alte doua siruri care sa aiba media aritmetica egala
2. primul sir o sa aiba media aritmetica m1=s1/n1, unde s1 reprezinta suma elementelor din sir, iar n1 reprezinta numarul de elemente din sir
3. al doilea sir o sa aiba media aritmetica m2=s2/n2, unde s2 reprezinta suma elementelor din sir, iar n2 reprezinta numarul de elemente din sir
4. sirul initial o sa aiba media aritmetica m=s/n, unde s reprezinta suma elementelor din sir, iar n reprezinta numarul de elemente din sir
OBSERVATIE:   n1+n2=n 
            s1+s2=s
Exemplu: sirul initial este A=[1,2,3,4,5,6,7,8], iar n=8, s=36. Sirurile care se pot determina, astfel incat conditia sa se respecte(media aritmetica sa fie aceeasi): B=[1,4,5,8] si C=[2,3,6,7]
s1(suma corespunzatoare sirului B)=18, n1=4
s2(suma corespunzatoare sirului C)=18, n2=4
Se poate observa ca ecuatiile de mai sus sunt respectate.
5. s2=s-s1, iar n2=n-n1
Totodata mediile arimetice trebuie sa fie egale, deci m1=m2. De aici rezulta ca:  s_1/n_1  =  s_2/n2
Dupa ce inlocui s2 si n2 o sa ajungem la urmatoarea ecuatie:  s_1/n_1  =  (s-s1)/(n-n1) → s1*n – s1*n1 = n1*s – n1*s1 → s1 = (s*n1)/n
Asadar, trebuie sa gasim o submultime a lui A, sirul initial, care sa respecte conditia de mai sus: ca suma elementelor din sirul construit sa fie egala cu (suma elementelor din sirul initial * numarul elementelor din sirul construit)/numarul elementelor din sirul initial.
Daca gasim un sir care sa respecte aceasta conditie, inseamna ca sirul initial se poate imparti in alte doua siruri care sa aiba media aritmetica egala. Deci programul o sa returneze true, altfel o sa returneze false. 
