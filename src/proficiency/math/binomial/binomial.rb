def factorial(n)
  x = 1
  for i in 1..n
    x *= i
  end
  return x
end

def choose(n, k)
  return factorial(n)/(factorial(k) * factorial(n-k))
end

def binomial(n)
  values = []
  
  for k in 0..n
    coefficient = choose(n, k)
    a_exponent = n-k
    b_exponent = k

    value = "#{coefficient}a^#{a_exponent}b^#{b_exponent}"
    values.push(value)
  end

  return values.join(" + ")
end

puts binomial(ARGV[0].to_i)
