public class perceptron {
    private double[] weight = {};
    private double[] value = {};
    
    public perceptron(){
        weight = new double[0];
        value = new double[0];
    } //This creates a basic perceptron if not given wreights or values

    public perceptron(double[] newValue,double[] newWeight){
        weight = newWeight;
        value = newValue;
    } //Creates a perceptron given values and weights.

//These next few peices of code are here just to eddit a perceptron or get a percepteon 
    public void SetWeight(double[] newWeight){
        weight = newWeight;
    }

    public void SetValue(double[] newValue){
        value = newValue;
    }

    public void setPerceptron(double[] newValue, double[] newWeight){
        weight = newWeight;
        value = newValue;
    }

    public double[] getWeight(){
        return weight;
    }

    public void SetWeight(int index, double newWeight){
        weight[index] = newWeight;
    }

    public void SetValue(int index, double newValue){
        value[index] = newValue;
    }

    public double[] getValue(){
        return value;
    }

    public double getWeight(int index){
        return weight[index];
    }

    public double getValue(int index){
        return value[index];
    }

    public double getProduct(int index1, int index2){
        return weight[index1] * value[index2];
    }
//Creates random values and weights
    public static void randomValues(double[] values){
        for(int j = 0; j < values.length;j++){
            values[j] = (Math.random()*10);
        }
    }

    public static void randomWeights(double[] weights){
        for(int k = 0; k < weights.length; k++){
            weights[k] = Math.random();
        }
    }
    //prints the perception
    public static void printPerceptron(perceptron arr){
        for(int i = 0; i < arr.weight.length; i++){
            System.out.print(" Weight:  " + arr.getWeight(i));
        }
        for(int j = 0; j < arr.value.length;j++){
            System.out.print(" Value: " + arr.getWeight(j));
        }
    }

    public double[] dotProduct(double[] arr, double[] arr2){
        double[] product = new double[arr.length];
        for(int i = 0; i < arr.length;i++){
            product[i] = arr[i] * arr2[i];
        }
        return product;
    }

    public static double[] dotProduct(perceptron p){
        double[] product = new double[p.getValue().length];
        for(int i = 0; i < product.length;i++){
            product[i] = p.getValue(i) * p.getWeight(i);
        }
        return product;
    }

    public static double sum(double[] values, double[] weights){
        double sum = 0;
        for(int i = 0; i < values.length;i++){
            sum += values[i]*weights[i];
        }
        return sum;
    }

    public static double sum(perceptron value){
        double sum = 0;
        for(int i = 0; i < value.getWeight().length; i++){
            sum += value.getValue(i)*value.getWeight(i);
        }
        return sum;
    }

    public static double sum(double[] dot){
        double sum = 0;
        for(int i = 0; i < dot.length;i++){
            sum += dot[i];
        }
        return sum;
    }
//Trainging stuff. I don't know how it works, just that it works. I mean, I know how it works, just don't want to explain it.
    public static void trainToValue(perceptron p, int value , double trainingValue){
        if (perceptron.sum(p) < value){
            while (perceptron.sum(p.getWeight(),p.getValue()) < value){
                for(int i = 0; i < p.getWeight().length; i++){
                    double increase = p.getWeight(i) + (p.getValue(i) * trainingValue);
                    p.SetWeight(i,increase);
                }
            }
        }
        else if(perceptron.sum(p) > value){
            while(perceptron.sum(p) > value){
                for(int j = 0; j < p.getWeight().length; j++){
                    double reduce = p.getWeight(j) - (p.getValue(j) * trainingValue);
                    p.SetWeight(j,reduce);
                }
            }
        }
    }

    public static void trainToValue(perceptron p, int value, double trainingValue, int epochs){
        if(perceptron.sum(p) < value){
            for (int k = 0; k < epochs; k++){
                for(int i = 0; i < p.getWeight().length; i++){
                    double increase = p.getWeight(i) + (p.getValue(i) * trainingValue);
                    p.SetWeight(i,increase);
                }
            }
        }
        else if(perceptron.sum(p) > value){
            for (int l = 0; l < epochs; l++){
                for(int j = 0; j < p.getWeight().length; j++){
                    double reduce = p.getWeight(j) - (p.getValue(j) * trainingValue);
                    p.SetWeight(j,reduce);
                }
            }
        }
    }

    public static void trainEach(perceptron p, int place, int value, double trainingValue){
        if ((int)(p.getValue(place)* p.getWeight(place)) != value){
            if((int)(p.getValue(place)* p.getWeight(place)) < value){
                while((int)(p.getValue(place)* p.getWeight(place)) != value){
                    double increase = p.getWeight(place) + (p.getValue(place) * trainingValue);
                    p.SetWeight(place, increase);
                }
            }

        else{
            while((int)(p.getValue(place)* p.getWeight(place)) != value){
                double reduce = p.getWeight(place) - (p.getValue(place) *trainingValue);
                p.SetWeight(place, reduce);
            }
            }
        }
    }
}
