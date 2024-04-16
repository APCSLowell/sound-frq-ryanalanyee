import java.util.*;
public class Sound
{
  int[] samples;
  public int limitAmplitude(int limit)
  {  
    int sum = 0;
    for(int i = 0; i < samples.length; i++){
    if(limit < samples[i]){
      samples[i] = limit; 
      sum++;
    }
      if(-limit > samples[i]){
        samples[i] = -limit;
        sum++;
      }
      }
    return sum;
  }
  public void trimSilenceFromBeginning()
  {
   int n = 0; 
    while(samples[n] == 0){
n++;
    }

int [] newSamples = new int[samples.length-n];
    for(int i = 0; i < newSamples.length; i++) {
      newSamples[i] = samples[i+n];
  }
    samples = newSamples;
}
}
