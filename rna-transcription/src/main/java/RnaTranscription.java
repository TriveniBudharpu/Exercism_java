public class RnaTranscription {

    public String transcribe(String dnaStrand) {
        String rnaStrand="";
        for (int index = 0; index < dnaStrand.length(); index++) {
            rnaStrand+=getNucleotideComplement(dnaStrand.charAt(index));
        }
        return rnaStrand;
    }
    public String getNucleotideComplement(char nucleotide)
    {
        switch(nucleotide)
        {
            case 'G':return "C";
            case 'C':return "G";
            case 'T':return "A";
            case 'A':return "U";
        }
        return null;
    }
}

