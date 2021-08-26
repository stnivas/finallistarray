import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.Map.*;

public class HashMapTaskB{
	    static Scanner input=new Scanner(System.in);
//Question1		
	public HashMap<Integer,String> map(){
   	  HashMap<Integer,String> mapList=new HashMap<Integer, String>(); 
	  return mapList;	  
    }
//Question2 
	public HashMap<String,String> addMap(String[] key,String[] values){
	 HashMap<String,String> map=new HashMap<String, String>();
	 	for(int run=0;run<key.length;run++){
	   		map.put(key[run],values[run]);
	    }
	 return map;
	}
//Question3	
	public HashMap<Integer,Integer> addInt(int[]number,int[]phoneNumber){
	 HashMap<Integer,Integer> mapThree=new HashMap<Integer,Integer>();
     	for(int run=0;run<number.length;run++){
     		mapThree.put(number[run],phoneNumber[run]);
     	}
    return mapThree;
   }
//Question4
	public HashMap<String,Integer> addStringInt(String[] name,int[] num){
	 HashMap<String,Integer> mapFour=new HashMap<String,Integer>();
	 	for(int run=0;run<name.length;run++){
	 		mapFour.put(name[run],num[run]);
	 	}
	 return mapFour;
	}
//Question5
	public void checkValue(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the key");
	 String name=input.next();
	 System.out.println("2.enter address  ");
	 String address=input.next();
	   map.put(name,address);
	   }
	 }  
//Question6	 	
	public HashMap<String,String> addNullValues(String[]animalKey,String[] animalValues){
	 HashMap<String,String> mapSix=new HashMap<String,String>(); 
	 	for(int run=0;run<animalKey.length;run++){
	 		mapSix.put(animalKey[run],animalValues[run]);
	 	}
    return mapSix;
   }
//Question7
	public HashMap<String,String> addNullKey(String[]animalKey,String[] animalValues){
	 HashMap<String,String> mapSaven=new HashMap<String,String>(); 
		 
		 for(int run=0;run<animalKey.length;run++){
		 	mapSaven.put(animalKey[run],animalValues[run]);
		 }
	 return mapSaven;
	}	 
//Question8 doubt
    public  HashMap<String,String>keyCheck(String[]animalKey,String[] animalValues){
		HashMap<String,String>mapEigth=new HashMap<String,String>();
			
			for(int run=0; run<animalKey.length;run++){
			   mapEigth.put(animalKey[run],animalValues[run]);
			}
		 mapEigth.containsKey(animalKey);
		return  mapEigth;	
	 }

//Question9 doubt
    public  HashMap<String,String>valueCheck(String[]animalKey,String[] animalValues){
	   	HashMap<String,String>mapNine=new HashMap<String,String>();
			
			for(int run=0; run<animalKey.length;run++){
			   mapNine.put(animalKey[run],animalValues[run]);
			}
		 mapNine.containsValue(animalKey);
		return  mapNine;
		}
//Question10
  
    public HashMap<String,String> change( HashMap<String,String> mapTen,String[] newValues){
        HashMap<String,String> mapTen=new HashMap<String,String>();
        
        
	       for(int run=0; run<animalKey.length; run++){
			   mapTen.put(animalKey[run],animalValues[run]);
	       }
	       for(int run=0; run<animalKey.length; run++){

      		 mapTen.put(animalKey[run], newValues[run]);
      	}
       return  mapTen;       
    } 
    
//Question11         
	public HashMap<String,String> getValuesUseExistKey(String[] animalKey, String[]animalValues){
	   HashMap<String,String> mapEleven=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapEleven.put(animalKey[run],animalValues[run]);
	       }
	   System.out.println("enter the key to get values of map");
	   String see=input.next();
	  System.out.println( mapEleven.get(see));
    	return mapEleven;
    	}	
//Question12
	public HashMap<String,String> getValuesUseNonExist(String[] animalKey, String[]animalValues){
	   HashMap<String,String> mapTwelve=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapTwelve.put(animalKey[run],animalValues[run]);
	       }
	   System.out.println("enter the  nonExist key to get values of map");
	   String nonExist=input.next();
	  System.out.println( mapTwelve.getOrDefault(nonExist, "sriMurugan"));
    	return mapTwelve;
    	}		
//Question13		
	
	public HashMap<String,String> getValuesUseNonExistKey(String[] animalKey, String[]animalValues){
	   HashMap<String,String> mapThirteen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapThirteen.put(animalKey[run],animalValues[run]);
	       }
	   System.out.println("enter the  nonExist key to get values of map");
	   String nonKey=input.next();
	   System.out.println( mapThirteen.getOrDefault(nonKey, "ZOHO"));
    	return mapThirteen;
}

//Question14

 public HashMap<String,String> removeExistingKey(String[] animalKey, String[]animalValues){
	   HashMap<String,String> mapFourteen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapFourteen.put(animalKey[run],animalValues[run]);
	       }
	        
	        System.out.println("before map"+ mapFourteen); 
	       
			 System.out.println(mapFourteen.remove(animalKey));
	  
    	return mapFourteen;
         } 
 //Question15           
  public HashMap<String,String> removeValue (String[] animalKey, String[]animalValues,String keyName, String valueName){
	   HashMap<String,String> mapFifteen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapFifteen.put(animalKey[run],animalValues[run]);
          }
	           mapFifteen.remove(keyName, valueName );
	           
	        
    	return mapFifteen;
         } 
             
//Question16
   public HashMap<String,String> replaceValueSame(String[] animalKey, String[]animalValues, String  keyName, String valueName){
	   HashMap<String,String> mapSixteen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapSixteen.put(animalKey[run], animalValues[run]);
	       }
	        
	  System.out.println("before map"+ mapSixteen); 
      System.out.println(mapSixteen.replace(keyName, valueName ));
	      
	        
    	return mapSixteen;
         }       
//Question17
   public HashMap<String,String> replaceValueSome (String[] animalKey, String[]animalValues,String keyName, String oldValue, String newValue){
	   HashMap<String,String> mapSeventeen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapSeventeen.put(animalKey[run],animalValues[run]);
          }
	           mapSeventeen.replace(keyName, oldValue, newValue );
	           
	        
    	return mapSeventeen;
         } 
 //Questio18             
 
 public HashMap<String,String> replaceValue (String[] animalKey, String[]animalValues){
	   HashMap<String,String> mapEighteen=new HashMap<String,String>();
	
	       for(int run=0; run<animalKey.length; run++){
			   mapEighteen.put(animalKey[run], animalValues[run]);
	       }
	        
	  System.out.println("before map"+ mapEighteen); 
    
	      
	    HashMap<String,String> secondMap=new HashMap<String,String>();
	       secondMap.putAll(mapEighteen);
	       System.out.println("after map"+secondMap);
    	return mapEighteen;
         }               
                                           
//question19
      public  HashMap<String,String>  iterateMap(String[]key,String[]value){
        HashMap<String,String> maps=new HashMap<String,String>();
        
  
        
	    for(int run=0; run<key.length; run++){
        
             	maps.put(key[run], value[run]);
            }
         
            for(Map.Entry entry: maps.entrySet()) {
            	 
        System.out.println(entry.getKey() + " " + entry.getValue());
            
            }
            return maps;
            }  
            
//Question20       
 public  HashMap<String,String> removeEntries(String[]key,String[]value){     
    HashMap<String,String> mapLast=new HashMap<String,String>();
       
	    for(int run=0; run<key.length; run++){
       
              mapLast.put(key[run], value[run]);
            }
            
            mapLast.clear();
       return mapLast;
            }
            
                         		
   /* maim method will be start at below */

	public static void main(String[] args){
	     HashMapTaskB obj=new HashMapTaskB();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	     
	switch(choice){
		case 1:
		       HashMap<Integer,String> mapList=obj.map();
		       System.out.println("map" +mapList);
		       System.out.println("map size" + mapList.size());
		       System.out.println("Run successfully");
		break;
		
		
		case 2:
		       System.out.println("enter the number of key and values you need to put the map");
		       int count=input.nextInt();
		       String[] key=new String[count];
		       String[] values = new String[count];
		       System.out.println("enter the"+ count+ "Key and value");
		       
		       	for(int run=0;run<count;run++){
		       		key[run]=input.next();
		       		values[run] = input.next();
		       }
		       
		       HashMap<String,String> map= obj.addMap(key,values);
		        System.out.println("HashMap" +map);
		        System.out.println("HashMap size" +map.size());
		        System.out.println("Run successfully");
		break;
		
		
		case 3:
		       System.out.println("enter the number of key and values you need to put the map");
		       count=input.nextInt();
		       int[]number=new int[count];
		       int[]phoneNumber=new int[count];
		       System.out.println("enter the" +count+ "key and values");
		       
		       	for(int run=0; run<count; run++){
		       		number[run]=input.nextInt();
		       		phoneNumber[run]=input.nextInt();
		       }
		       
		       HashMap<Integer,Integer> mapThree=obj.addInt(number,phoneNumber);
		       System.out.println("HashMap="+mapThree);
		       System.out.println("HashMap size="+mapThree.size());
		       System.out.println(" Run successfully");
		break;
		
		case 4:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   String[] name=new String[count];
			   int num[]=new int [count];
			   System.out.println("enter the" +count+ "key and values");
			   
			   	for(int run=0;run<count; run++){	
			    	name[run]=input.next();
			    	num[run]=input.nextInt();
			   }
		      HashMap<String,Integer> mapFour=obj.addStringInt(name,num);
		      System.out.println("HashMap="+mapFour);
		      System.out.println("HashMap size="+mapFour.size());
		      System.out.println(" Run successfully");
		break;
		
	  case 5:
		       obj.checkValue();
		       System.out.println(" Run successfully");
		break;
		
		case 6:
		       System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   String[] animalKey=new String[count];
			   String[] animalValues=new String [count];
			   System.out.println("enter the" +count+ "key and values");
			   
			   	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
			   }
		      HashMap<String,String> mapSix=obj.addNullValues(animalKey,animalValues);
		      System.out.println("HashMap="+mapSix);
		      System.out.println("HashMap size="+mapSix.size());
		      System.out.println("Run successfully");
		break;
		
		
		case 7:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the null key and then add" +count+ "with values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		      HashMap<String,String> mapSaven=obj.addNullValues(animalKey,animalValues);
		      System.out.println("HashMap="+mapSaven);
		      System.out.println("HashMap size="+mapSaven.size());
		      System.out.println("Run successfully");
		break;
		
		case 8:
		      
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		        
		        
		        
		      HashMap<String,String> mapEigth=obj.keyCheck(animalKey,animalValues);
		      System.out.println("HashMap="+mapEigth);
		      System.out.println("HashMap size="+mapEigth.size());
		      System.out.println("Run successfully");
			  System.out.println(mapEigth.containsKey(animalKey));  
			  
		break;
		 case 9:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		      HashMap<String,String> mapNine=obj.valueCheck(animalKey,animalValues);
		      System.out.println("HashMap="+mapNine);
		      System.out.println("HashMap size="+mapNine.size());
		      System.out.println("Run successfully");
			  System.out.println(mapNine.containsKey(animalKey));  
		
		       System.out.println(" Run successfully");
		break;
	
		case 10:
	           System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		        System.out.println("enter the number of values you need to change the map");
		        int counts=input.nextInt();
		        String[] newValues=new String[counts];
		         
		        	for(int run=0;run<counts; run++){	
			    	  newValues[run]=input.next();
		            }
              HashMap<String,String> mapTen=addMap(animalKey,animalValues);
		      HashMap<String,String> mapTen=obj.change(mapTen, newValues);
		      System.out.println("HashMap="+mapTen);
		      System.out.println("HashMap size="+mapTen.size());
		      System.out.println("Run successfully");
			  
		       
		break;
		
		case 11:
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		   
		     HashMap<String,String>mapTwevle=obj.getValuesUseExistKey(animalKey,animalValues);
		       System.out.println(" Run successfully");
		break;
		
	   case 12:
	          System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		   
		     HashMap<String,String>mapTwelve=obj.getValuesUseNonExist(animalKey,animalValues);
		     System.out.println(" Run successfully");
		      
		break;
		
		case 13:
		       
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		   
		     HashMap<String,String>mapThirteen=obj.getValuesUseNonExistKey(animalKey,animalValues);
		     System.out.println(" Run successfully");
		       
		       
		       
		       
		break;
		
		
		case 14:
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		   
		     HashMap<String,String>mapFourteen=obj.removeExistingKey(animalKey,animalValues);
		     System.out.println(" after HashMap="+mapFourteen);
		     System.out.println(" after HashMap size="+mapFourteen.size());
		     System.out.println(" Run successfully");
		       
		 
		break;
		
		case 15:
		       
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		        
		      System.out.println("enter the key");
		    
		      String  keyName= input.next(); 
		      
		      
		     System.out.println("enter the values");
		        String  valueName= input.next(); 
		   
		     HashMap<String,String>mapFifteen=obj.removeValue(animalKey,animalValues, keyName, valueName);
		     System.out.println(" after HashMap="+mapFifteen);
		     System.out.println(" after HashMap size="+mapFifteen.size());
		     System.out.println(" Run successfully");
		       
		break;
		
		
    	case 16:
		
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		        
		        
		        
		      System.out.println("enter the key");
		           keyName= input.next(); 
		     System.out.println("enter the values");
		          valueName= input.next(); 
		        
		        
		     HashMap<String,String>mapSixteen=obj.replaceValueSame(animalKey,animalValues, keyName,valueName);
		     System.out.println(" after HashMap="+mapSixteen);
		     System.out.println(" after HashMap size="+mapSixteen.size());
		     System.out.println(" Run successfully");
		              
		break;
		
		case 17:
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		        
		        
		        
		     System.out.println("enter the key");
		     keyName= input.next(); 
		     System.out.println("enter the old  value");
	         String  oldValue= input.next(); 
		     System.out.println("enter the new  value");
	         String  newValue= input.next(); 
		          
		        
		     HashMap<String,String>mapSeventeen=obj.replaceValueSome(animalKey,animalValues, keyName, oldValue,newValue);
		     System.out.println(" after HashMap="+mapSeventeen);
		     System.out.println(" after HashMap size="+mapSeventeen.size());
		     System.out.println(" Run successfully");
		break;
		
		case 18:
		      System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  animalKey=new String[count];
			  animalValues=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		   
		     HashMap<String,String>mapEighteen=obj.removeExistingKey(animalKey,animalValues);
		     System.out.println(" after HashMap="+mapEighteen);
		     System.out.println(" after HashMap size="+mapEighteen.size());
		     System.out.println(" Run successfully");
		       
		break;
		
		case 19:
		      System.out.println("enter the number of key and values you need to put the map");
			    count=input.nextInt();
			   String[] keys=new String[count];
			   values=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	keys[run]=input.next();
			    	values[run]=input.next();
		        }
	 	     HashMap<String,String>maps=obj.iterateMap(keys,values);
		     
		break;
	         
	   case 20:
	          System.out.println("enter the number of key and values you need to put the map");
			  count=input.nextInt();
			  keys=new String[count];
			  values=new String[count];
		      System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	keys[run]=input.next();
			    	values[run]=input.next();
		        }
	 	       HashMap<String,String>mapLast=obj.removeEntries (keys,values);
		     
		       System.out.println("after map"+mapLast);
		       System.out.println(" Run successfully");
		break;
	}
  }	
}
