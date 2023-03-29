let day=2;
let d='';
if(day==1) d='Mon'
else if(day==2) d='Tue'
else if(day==3) d='Wed'
else if(day==4) d='Thu'
else if(day==5) d='Fri'
else if(day==6) d='Sat'
else if(day==7) d='Sun'
else d="Invalid day"

console.log(day+"\n"+d);


switch(day) {
    case 1 : {
        console.log('👉 Mon')
        break;
    }
    case 2 : {
        console.log('👉 Tue')
        break;
    }
    case 3 : {
        console.log('👉 Wed')
        break;
    }
    case 4 : {
        console.log('👉 Thu')
        break;
    }
    case 5 : {
        console.log('👉 Fri')
        break;
    }
    case 6 : {
        console.log('👉 Sat')
        break;
    }
    case 7 : {
        console.log('👉 Sun')
        break;
    }
    default :{
        console.log('❌ Invalid Day')
    }
}