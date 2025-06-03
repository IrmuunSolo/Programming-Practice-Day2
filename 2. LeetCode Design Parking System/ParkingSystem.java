class ParkingSystem {
private:
    int bigSlots;
    int mediumSlots;
    int smallSlots;

public:
    ParkingSystem(int big, int medium, int small) {
        bigSlots = big;
        mediumSlots = medium;
        smallSlots = small;
    }
    
    bool addCar(int carType) {
        switch(carType) {
            case 1:  
                if(bigSlots > 0) {
                    bigSlots--;
                    return true;
                }
                return false;
            case 2:  
                if(mediumSlots > 0) {
                    mediumSlots--;
                    return true;
                }
                return false;
            case 3: 
                if(smallSlots > 0) {
                    smallSlots--;
                    return true;
                }
                return false;
            default:  
                return false;
        }
    }
};