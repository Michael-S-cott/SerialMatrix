# Welcome to Sonic Pi v3.1


ary = [61, 72, 83]




i = 0
j = 0
data = Array.new
voice = Array.new
linea = ''
use_synth :tri
File.open('//Users/michaelscott/desktop/serial_matrix/SonicPiInput.txt','r') do |f1|
  while linea = f1.gets
    
    while i <linea.length-1
      data = linea[i]+linea[i+1]
      voice = voice.push(data)
      play voice[j].to_i
      print("hi")
      sleep 1
      j +=1
      i +=3
    end
    i = 0
  end
end
