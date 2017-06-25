def prime_checker(n)
  if n < 2
    false
  elsif n == 2
    true
  elsif n % 2 == 0
      false
  else
      for i in (3..n).step(2)
        if n % i == 0
          return false
        end
      end
      true
  end
end

puts prime_checker(ARGV[0].to_i)
