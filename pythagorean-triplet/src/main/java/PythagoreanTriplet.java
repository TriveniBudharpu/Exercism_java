import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other = (PythagoreanTriplet) o;
        return a == other.a &&
                b == other.b &&
                c == other.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    static class PythagoreanTripletBuilder {
        private int factorsLessThanOrEqualTo;
        private int sumTo;
        PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int value) {
            factorsLessThanOrEqualTo = value;
            return this;
        }
        PythagoreanTripletBuilder thatSumTo(int value) {
            sumTo = value;
            return this;
        }
        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> tripletsList=new ArrayList<PythagoreanTriplet>();
            int k=0,k2=0;
            for (int i = 1; i <=factorsLessThanOrEqualTo ; i++) {
                for (int j = i+1; j <=factorsLessThanOrEqualTo ; j++) {
                    k2=i*i+j*j;
                    k=(int)Math.sqrt(k2);
                    if((k*k==k2) && k>j && k<=factorsLessThanOrEqualTo) {
                        if(isTripletsThatSumTo(sumTo,i,j,k))
                            tripletsList.add(new PythagoreanTriplet(i, j, k));
                    }
                }
            }
            return tripletsList;
        }
        private static boolean isTripletsThatSumTo(int num,int i,int j,int k) {
            return (i+j+k)==num;
        }
    }
}
