#include<stdio.h>
int main(){
int array[100],n,i,key,found=0;
printf("Enter number of elements in array:");
scanf("%d",&n);
printf("Enter %d elements:\n",n);
for(i=0;i<n;i++){
scanf("%d",&array[i]);
}
printf("Enter the elements to search:");
scanf("%d",&key);
for(i=0;i<n;i++){
if(array[i]==key){
printf("Elements found at position %d(index %d)\n",i+1,i);
found =1;
break;
}
}
if(!found){
printf("Enter elements not found in the array.\n");
}
return 0;
}