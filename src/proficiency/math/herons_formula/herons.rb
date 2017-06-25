def semiperimeter(a, b, c)
  return (a + b + c)/2.0
end

def area_of_triangle(a, b, c)
  s = semiperimeter(a, b, c)
  return Math.sqrt(s * (s-a) * (s-b) * (s-c))
end

a, b, c = ARGV.map(&:to_i)
puts area_of_triangle(a, b, c)
