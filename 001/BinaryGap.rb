
class BinaryGap

  def solution (number)

    binary = number.to_s(2)
    max = 0
    current = 0

    binary.each_char do |c|
      if c == '0'
        current += 1
      else
        max = current
        current = 0
      end
    end

    max
  end

end


#bg = BinaryGap.new
#puts "#{45633.to_s(2)} #{bg.solution(45633)}"
