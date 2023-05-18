abstract class Car{

    public RegNo:number;
    constructor(RegNo:number){
        this.RegNo=RegNo;
    }
    public abstract brakingSystem();
}
class Maruti extends Car{
    public CarName: string;
    constructor(CarName:string,RegNo:number){
            super(RegNo);
            this.CarName=CarName;
    }
    public brakingSystem() {
        let brake:string=this.CarName;   
        console.log("Braking System of : "+this.CarName+" is "+brake);
    }
}
class Suzuki extends Car{
    public CarName: string;
    constructor(CarName:string,RegNo:number){
            super(RegNo);
            this.CarName=CarName;;
    }
    public brakingSystem() {
        let brake:string=this.CarName;   
        console.log("Braking System of : "+this.CarName+" is "+brake);
    }
}
let car = new Maruti('Maruti 800',2345);
car.brakingSystem();
