public class tests {
    public static void main(String[] args) {
        double[] weights = new double[100];//Creates 100 weights
        double[] values = new double[100]; //Creates 100 values
        for (int j = 0; j < values.length; j++){
            weights[j] = Math.random();
            values[j] = Math.random()*10; //Creates random wrights for each perception to train off of.
        }
        perceptron[] network = new perceptron[100]; // This creates perceptrons that will aproximate to the value they are trained on.
        for (int i = 0; i < network.length; i++){ //This part is the training part.
            perceptron p = new perceptron(weights,values);
            network[i] = p;
            perceptron.trainToValue(network[i],i,0.01); //As the training value decreases, the model can approximate a value closer and closer to a given value.
            //System.out.println(perceptron.sum(network[i])); // This is just here to make sure it works.
        }
            
    }
}
